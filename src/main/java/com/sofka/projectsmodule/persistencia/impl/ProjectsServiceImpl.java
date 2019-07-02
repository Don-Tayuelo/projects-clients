package com.sofka.projectsmodule.persistencia.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sofka.projectsmodule.exceptionsHandler.excepciones.InvalidRequestBodyException;
import com.sofka.projectsmodule.exceptionsHandler.excepciones.ProjectNotFoundException;
import com.sofka.projectsmodule.exceptionsHandler.excepciones.ProjectsCollectionEmptyException;
import com.sofka.projectsmodule.models.CustomProjectsForBilling;
import com.sofka.projectsmodule.models.ProjectModel;
import com.sofka.projectsmodule.persistencia.ProjectModelRepository;
import com.sofka.projectsmodule.persistencia.servicios.ProjectsService;

@Service
public class ProjectsServiceImpl implements ProjectsService {

	@Autowired
	private ProjectModelRepository projectsRepository;

	public ProjectsServiceImpl(ProjectModelRepository projectModelRepository) {
		projectsRepository = projectModelRepository;
	}

	@Override
	public List<ProjectModel> getAllProjects() {
		if(projectsRepository.findAll().isEmpty()) throw new ProjectsCollectionEmptyException();
		{
			return projectsRepository.findAll();
		}
	}

	@Override
	public boolean putProject(String _id, ProjectModel projectModel) {

		if (!projectsRepository.existsById(_id))
			//throw new ProjectNotFoundException();
			return false;
		{
			mapNewProject(_id, projectModel);
		}
		//return new ResponseEntity<>("El proyecto con id \"" + _id + "\" fue actualizado.", HttpStatus.OK);
		return true;
	}

	public void mapNewProject(String _id, ProjectModel projectModel) {
		projectsRepository.findById(_id)
		.map(newProject -> {
			newProject.setProjectName(projectModel.getProjectName());
			newProject.setProjectDescription(projectModel.getProjectDescription());
			newProject.setProjectHours(projectModel.getProjectHours());
			newProject.setProjectPrice(projectModel.getProjectPrice());
			newProject.setListTeams(projectModel.getListTeams());
			newProject.setIdClient(projectModel.getIdClient());
			newProject.setClientName(projectModel.getClientName());
			return projectsRepository.save(newProject);
		});
	}

	@Override
	public boolean deleteSingleProject(String _id) {
		if(!projectsRepository.existsById(_id))
			throw new ProjectNotFoundException(); 
		{	
			projectsRepository.deleteById(_id); 
		}
		return true;
	}

	@Override
	public ProjectModel addProject(ProjectModel projectModel) {
		if(!validProjectBody(projectModel)) throw new InvalidRequestBodyException(); {
			return projectsRepository.save(projectModel);
		}
		//return new ResponseEntity<>("Proyecto guardado con éxito.", HttpStatus.OK);
	}

	private boolean validProjectBody(ProjectModel projectModel) {
		if(projectModel.getProjectHours() > 0) {
			if(projectModel.getProjectPrice() > 0) {
				if(projectModel.getListTeams().size() > 0) {
					return true;
				}
			}
		}
		return false;
	}

	public Optional<ProjectModel> getSingleProjectById(String _id) {
		return projectsRepository.findById(_id);
	}

	@Override
	public ArrayList<CustomProjectsForBilling> getProjectsForBilling() {
		ArrayList<ProjectModel> projectsList = (ArrayList<ProjectModel>) projectsRepository.findAll();
		ArrayList<CustomProjectsForBilling> projectsCustomList = new ArrayList<CustomProjectsForBilling>();
		
		for (int i = 0; i < projectsList.size(); i++) {
			projectsCustomList.add(new CustomProjectsForBilling(projectsList.get(i)));
		}
		return projectsCustomList;
	}
	
	@Override
	public boolean deleteAllProjects() {
		if(projectsRepository.findAll().isEmpty()) throw new ProjectsCollectionEmptyException();
		{
			projectsRepository.deleteAll();
			return true;
		}
	}
}

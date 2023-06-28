/**
 * 
 */
package projects.service;


import java.util.List;

import projects.dao.ProjectDao;
import projects.entity.Project;

public class ProjectService {
	private ProjectDao projectDao = new ProjectDao ();
	
	
	public Project addproject(Project project) {
		return projectDao.insertProject(project);
	}


	public Project addProject(Project project) {
		// TODO Auto-generated method stub
		return null;
	}


	public void deleteProject(Integer projectId) {
		// TODO Auto-generated method stub
		
	}


	public void modifyProjectDetails(Project project) {
		// TODO Auto-generated method stub
		
	}


	public Project fetchProjectById(Integer projectId) {
		// TODO Auto-generated method stub
		return null;
	}


	public List<Project> fetchAllProjects() {
		// TODO Auto-generated method stub
		return null;
	}
}
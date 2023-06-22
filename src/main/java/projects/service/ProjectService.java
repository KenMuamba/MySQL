/**
 * 
 */
package projects.service;


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
}
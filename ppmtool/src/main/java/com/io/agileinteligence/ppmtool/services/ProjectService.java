package com.io.agileinteligence.ppmtool.services;

import com.io.agileinteligence.ppmtool.domain.Project;
import com.io.agileinteligence.ppmtool.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdateProject(Project project) {

        ///TODO LOGIC

        return projectRepository.save(project);
    }
}

package com.io.agileinteligence.ppmtool.exceptions;

public class ProjectIdExceptionResponse {

    private String projectIdentifier;

    public String getProjectIdentifier() {
        return projectIdentifier;
    }

    public ProjectIdExceptionResponse(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
    }

    public void setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
    }
}

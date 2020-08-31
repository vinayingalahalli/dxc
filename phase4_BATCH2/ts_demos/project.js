"use strict";
exports.__esModule = true;
exports.Project = void 0;
var Project = /** @class */ (function () {
    function Project(pid, projectName, clientName) {
        this.pid = pid;
        this.projectName = projectName;
        this.clientName = clientName;
    }
    Project.prototype.printProjectDetails = function () {
        console.log('Project Details');
        console.log('Project ID : ' + this.pid);
        console.log('Project Name : ' + this.projectName);
        console.log('Client Name : ' + this.clientName);
    };
    return Project;
}());
exports.Project = Project;

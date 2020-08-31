export class Project{

    private pid:number;
    private projectName:string;
    private clientName:string;

    constructor(pid:number,projectName:string,clientName:string){
        this.pid=pid;
        this.projectName=projectName;
        this.clientName=clientName;
    }

    public printProjectDetails():void{
        console.log('Project Details');
        console.log('Project ID : '+this.pid);
        console.log('Project Name : '+this.projectName);
        console.log('Client Name : '+this.clientName);
    }
}
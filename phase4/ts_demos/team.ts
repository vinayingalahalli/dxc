export class Team{

    private teamId:number;
    private teamName:string;

    constructor(teamId:number,teamName:string){
        this.teamId=teamId;
        this.teamName=teamName;
    }

    public printTeam():void{
        console.log('team details');
        console.log('team id : '+this.teamId);
        console.log('team name : '+this.teamName);
    }
}
import { Person } from "./person";
import { Team } from "./team";
export class Player extends Person {
    public childImplementation(): void {
        console.log('Implemented in Player');
    }

    private score: number;
    private team:Team;
    constructor(id: number, name: string, score: number,team:Team) {
        super(id, name);
        this.score = score;
        this.team=team;
    }

    public printPlayer():void{
        console.log('Printing Player');
        super.printPerson();
        console.log('score = '+this.score)
        this.team.printTeam();
    }
}
export class Calculator{

    private a:number;
    private b:number;

    constructor(a:number,b:number){
        this.a=a;
        this.b=b;
    }

    public add():number{
        return(this.a+this.b);
    }
    
    // public add(a:number,b:number):number{
    //          return(a+b);
    //      }

        //  public add(a:string,b:string):string{
        //     return(a+b);
        // }

        public sumofElements(...values:number[]):number{
            let sum:number=0;
            values.forEach(e=>{
                sum=sum+e;
            });
            return sum;
        }
}
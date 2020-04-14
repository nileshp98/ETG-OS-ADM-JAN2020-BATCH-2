class Student
{
    stdId:number;
    stdName: string;
    stdClass :string;

    constructor(id:number,name:string,sclass:string)
    {
        this.stdId=id;
        this.stdName=name;
        this.stdClass=sclass;
    }
    display():void {
        console.log(this.stdId + " , "+this.stdName+ ", "+this.stdClass);
    }
}
let std1 = new Student(101,"ABC","10");
std1.display();
let std2= new Student(102,"BCD","10");
std2.display();
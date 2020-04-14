class T_shirt{
    color:string;
    material:string;
    design:string;

    constructor(color:string,material:string,design:string){
        this.color=color;
        this.material = material;
        this.design=design;
    }
    
    x_large(material:string):string{
        this.material=material;
        return this.material;
    }
     display():void{
        console.log("Color: "+this.color+", material :"+this.material+",design: " + this.design);
    }

}
let small=new T_shirt("Red","1 meter",'Round Neck');
small.display();
let large= new T_shirt("Green","1 meter",'Round Neck');
large.display();
let xt_large= new T_shirt("Yellow","1_meter","Polo");
xt_large.material="2 meters";
xt_large.display();
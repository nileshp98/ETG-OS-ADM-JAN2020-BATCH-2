import {Car} from "./Car" 
class Truck extends Car
{
    weight :number;
    constructor(s:number,rp:number,c:string,weight : number) {
        super(s,rp,c);
        this.weight=weight;
    }
    getSalePrice():number{
        if(this.weight>2000)
        {
           const salePrice=this.regularPrice-this.regularPrice*0.10;
           return salePrice;
        }
        else
        {
            const salePrice=this.regularPrice-this.regularPrice*0.20;
            return salePrice;
        }
        
    }
}
let truck1 = new Truck(70,10000,"Blue",1000);
truck1.display();
console.log(truck1.getSalePrice());
let truck2 = new Truck(90,15000,"Orange",2000);
truck2.display();
console.log(truck2.getSalePrice());
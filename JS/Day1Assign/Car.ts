export class Car
{
    speed:number;
    regularPrice: number;
    color: string;
    
    constructor(speed:number,price:number,color:string)
    {
        this.speed=speed;
        this.regularPrice=price;
        this.color=color;
    }

    getSalePrice():number{
        
       const salePrice =this.regularPrice-this.regularPrice*.10;

        return salePrice;
    }
    display()
    {
        console.log("Speed: " +this.speed+", Regular Price: "+ this.regularPrice+ ", Color: "+ this.color);
        console.log("Sale Price: " +this.getSalePrice() );
    }
}
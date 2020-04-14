class Product
{
    prdId:number;
    prdNamme:string;
    prdPrice:number;

    constructor(id:number,name:string, price: number)
    {
        this.prdId=id;
        this.prdNamme=name;
        this.prdPrice=price;
    }
     additionalGst():number{
         const totalCost=this.prdPrice+this.prdPrice*0.18;
         return totalCost;
     }
     display():void{
         console.log("Product Id: "+this.prdId+", Product: "+this.prdNamme +", Product Price with GST :"+ this.additionalGst());
     }
}
let prd1=new Product(201,"LapTop",25000);
prd1.display();
let prd2 = new Product(202,"iPhone",50000);
prd2.display();
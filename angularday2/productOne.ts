import {Component } from "@angular/core";

@Component({
  selector:"product-display",
  template:` 
  <div>
  <h1> Product details</h1>
   {{productName}}{{productPrice}}
  </div>
  `
})
export class ProductOne{
  productName:string="fridge";
  productPrice:number=1200;
}

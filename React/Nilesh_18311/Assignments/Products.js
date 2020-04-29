import React from 'react';
import ReactDOM from 'react-dom';
import Paper from 'material-ui/Paper';
import {
    Table,
    TableBody,
    TableHeader,
    TableHeaderColumn,
    TableRow,
    TableRowColumn, } from 'material-ui/Table'
class  Products extends React.Component{
    constructor(props){
        super(props);
        this.state={ count:1 };
    }
    render(){
        return(
            <h3> here are the products ! </h3>
            <table>
                <tr>           key={productlist.id}>
                                                <td>{productlist.name}</td>
                                                <td>{productlist.description}</td>
                                                <td>{productlist.description}</td>
                                                <tr> <td>Price per each item: {productlist.price}</td></tr>
                                                    <br/> <span> quantity:  {this.state.count}  </span>
                                                    </tr>


                                </table>
        );
    
    let Products=[
        {
            id:1, name:"Fastrack Women's Watch", 
            description:"Analog Pink Dial Women's Watch - 6150SM04",
            price:2500
        },
        {
            id:2, name:"Fastrack Women's Watch", 
            description:"Analog Pink Dial Women's Watch - 6150SM04",
            price:2100
        },
        {
            id:3, name:"Fastrack Women's Watch", 
            description:"Analog Pink Dial Women's Watch - 6150SM04",
            price:1800
        },
    
    ];
}
   
    
}

export default Products;
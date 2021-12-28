import React from 'react';
import Menu from './menu.js';
import PropExp from './propExp.js';


function LoginPage() {

    return (
        <div>
            <Product></Product>
            <label>Customer Name</label>
            <input></input>
            <CustomerRegistration></CustomerRegistration>
        </div>
    )


}

function CustomerRegistration() {

    return (
        <div>
            <p> Customer Registration </p>
        </div>
    )
}


class Product extends React.Component {
    render() {
        return (
            <div>
                <h1>Product </h1>
                <Menu></Menu>
                <PropExp> </PropExp>
            </div>
        );
    }
}



export default LoginPage;

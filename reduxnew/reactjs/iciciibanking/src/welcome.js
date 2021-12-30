import React from 'react';


function Welcome() {

    return (
        <div>

            <h1>  ICICI i Banking</h1>

            <Land></Land>

            <Product></Product>

            <hr></hr>

            <p> Welcome to Icici Bank</p>

        </div>

    )

}


function Land() {

    return (
        <div>

            <h1>  Land i Banking</h1>

            <hr></hr>

            <p> ddd to Icici Bank</p>

        </div>
    )
}


class Product extends React.Component {

    componentDidMount() {
        console.log("componentDidMount");
    }

    componentWillUnmount(){
        console.log("componentWillUnmount");
    }


    render() {
        return (
            <div>
                <h1>Credit Card</h1>
                <div>Sample  </div>
                <h1>Debit Card</h1>
            </div>

        );
    }
}



export default Welcome;
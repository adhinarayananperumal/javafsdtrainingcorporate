
import React from 'react';


export default class Menu extends React.Component {

    display() {
        console.log("Diplaying......");
    }

    render() {
        console.log("render");

        return (<h1>Menu {this.display()}</h1>);
    }

    componentWillMount(){
        console.log("componentWillMount");
    }

    componentDidMount(){
        console.log("componentDidMount");

    }


}


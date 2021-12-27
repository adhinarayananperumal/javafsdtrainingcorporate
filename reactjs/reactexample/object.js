//You define (and create) a JavaScript object with an object literal:

const person = {firstName:"John", lastName:"Doe", age:50, eyeColor:"blue"};


const person1 = {
  firstName: "John",
  lastName : "Doe",
  id       : 5566,
  fullName : function() {
    return this.firstName + " " + this.lastName;
  }
};



name = person1.fullName();


console.log(name);
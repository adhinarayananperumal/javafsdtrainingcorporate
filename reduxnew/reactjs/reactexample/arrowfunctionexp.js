
/*
Arrow function
*/

function calTotal(){
console.log(" total mark is.f...")	
}

//const calTotal =  () => console.log(" total mark is....")


//calTotal();


// parameter

function calTotalpp( mark1 , mark2){
	let total = mark1 + mark2;
    console.log(" total mark is.f..." + total)	
}

const calTotalp =  (mark1,mark2) => { 
	let total = mark1 + mark2;
    console.log(" total mark is...." + total)

}

//calTotalp(90,90);

hello = () => "Hello World!";


let message = hello();
console.log(message);

//-------------------------begning----------------------------------------------
function addTwoNumber(){
let mathsMark=50;
let scienceMark=90;
let totalMark=mathsMark + scienceMark;
console.log(totalMark);
}
//addTwoNumber();
//---------------------------------end-------------------------------------
//--------------------------------begning---------------------------------------
// example for var
function varTest(){
let mathsMark=80;
let scienceMark=90;
var totalMark=mathsMark + scienceMark;
}
//varTest();
//-------------------------------end----------------------------------------
//-----------------------------begning------------------------------------------
// example for variable scope global scope
//var totalMark;
//console.log(totalMark);
function varTestglobal(){
let mathsMark=80;
let scienceMark=70;
totalMark=mathsMark + scienceMark;
}
//varTestglobal();
//console.log(totalMark);
//----------------------------------end-------------------------------------
//-----------------------------begning------------------------------------------
// example for variable declaration const
//var totalmark=0;
let status="p";
function varTestConstant(){
let mathsMark=80;
let scienceMark=50;
totalMark=mathsMark + scienceMark;
console.log(totalMark);
console.log(status);
}
varTestConstant();
console.log(totalMark);
console.log(status);
//----------------------------------end-------------------------------------



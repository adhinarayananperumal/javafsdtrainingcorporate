
try{
 myPromise = new Promise(function(myResolve, myReject) {
  let x = 0;
// some code (try to change x to 5)
  if (x == 0) {
    myResolve("OK");
  } else {
throw new Error("Error happened");  } 
});

let w = 3/0;
console.log(w);
throw new Error("dddddddddd");  

}catch(e){
	console.log("error caught....."+e);
}

myPromise.then(
  function(value) {console.log("Success" + value);},
  function(error) {console.log("fail...." + error);}
);

console.log("end program");
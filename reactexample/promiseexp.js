/*
promise   https://www.educative.io/edpresso/what-are-promises-in-javascript?aid=5082902844932096&utm_source=google&utm_medium=cpc&utm_campaign=edpresso-dynamic&gclid=Cj0KCQjwsqmEBhDiARIsANV8H3Zqf9D7CTCAfW3aaqm5Qf4z2y4eZAZ3nwyob6Mx_ksB7AzdT76wfPMaAg_SEALw_wcB
https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Using_promises
https://medium.com/javascript-scene/master-the-javascript-interview-what-is-a-promise-27fc71e77261
*/



let promise = new Promise((resolve, reject) => { 
  // Code to perform the promised task
  let task_performed = false;
  if(task_performed) { 
    resolve ('The promised task was performed successfully....'); 
  } else { 
    reject('The promised task was not performed.'); 
  } 
});  
promise.then((fromRes) => console.log(fromRes)). 
  catch((fromRej) => console.log(fromRej));
  
  
  
  
const wait = time => new Promise((resolve) => {setTimeout(resolve, time); console.log("s");});
console.log("n");
wait(3000) // 'Hello!'

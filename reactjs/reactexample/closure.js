function multiplier(factor) {
  return number => number * factor;
}

let twice = multiplier(2);
let twice = multiplier(2);

console.log(twice(5));
console.log(twice(5));

/*  
https://eloquentjavascript.net/03_functions.html
This feature—being able to reference a specific instance of a local binding in an enclosing scope—is 
called closure. A function that references bindings from local scopes around it is called a closure. 
This behavior not only frees you from having to worry about lifetimes of bindings but also makes it 
possible to use function values in some creative ways.
*/

/*
function wrapValue(n) {
  let local = n;
  return () => local;
}

let wrap1 = wrapValue(1);
let wrap2 = wrapValue(2);
console.log(wrap1());
// → 1
console.log(wrap2());
// → 2

*/
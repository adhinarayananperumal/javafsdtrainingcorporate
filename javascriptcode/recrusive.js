var factorial = function(number) {
	
  if (number <= 0) { // terminal case
    return 1;
  } else { // block to execute
  console.log(number);
    return (number * factorial(number - 1));
  }
};
console.log(factorial(6));
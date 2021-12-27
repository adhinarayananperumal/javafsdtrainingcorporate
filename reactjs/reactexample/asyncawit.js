// The menu
var menu = ['Hamburger', 'Chicken Soup', 'Pasta'];

// The following function returns a promise that resolves if the customer
// orders something from the menu:

function resolve(m){
	console.log("resolve..............."+m);
}


function order_food (order) {
    let promise = new Promise((resolve, reject) => { 
    if(menu.includes(order)) { 
        resolve(); 
    }else { 
        reject('This item is not on the menu.'); 
  } 
});
    return promise;
}

// The following function returns a promise that resolves if the customer
// pays 20 or more for the food:
function make_payment (payment) {
    let promise = new Promise((resolve, reject) => { 
    if(payment >= 20) { 
        return resolve("resolved"); 
    }else { 
        reject('Your order costs 20.'); 
  } 
});
    return promise;
}

// await can only be used inside an async function
async function eat(order, payment){
    // waiting for the promises to resolve
    try{
        await order_food(order);
        console.log("Order received by the customer...");
        console.log("Collect payment.");
        await make_payment(payment);
        console.log("Payment received." + m);
    }
    // Catching errors or rejected promises
    catch (error){
        console.log(error)
    }
}

// Customer places his/her order and specifies the amount to pay
// Play around with these parameters to fully understand what is going on.
eat("Hamburger", 20);
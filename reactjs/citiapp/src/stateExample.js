import React, { useState } from 'react';

export default function StateExample() {
    // Declare a new state variable, which we'll call "count"
    const [count, setCount] = useState(0);
    const [customerName, setCustomerName] = useState("Ravi");
    const [age, setAge] = useState(28);


    return (
        <div>
            <p> Customer Name is : {customerName}</p>

            <p>You clicked {count} times</p>
            <button onClick={() => setCount(count + 1)}>
                Click me
            </button>
        </div>
    );
}



function Welcome(props) {
    return <h1> Product -  {props.name}</h1>;
  }
  
  export default function Product() {
    return (
      <div>
        <Welcome name="CreditCard" />
        <Welcome name="Personal Loan" />
        <Welcome name="Saving Account" />
      </div>
    );
  }
  
  
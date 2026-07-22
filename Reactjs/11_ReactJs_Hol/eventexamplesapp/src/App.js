import React, { useState } from 'react';

function App() {
  const [count, setCount] = useState(5);
  const [amount, setAmount] = useState('');
  const [currency, setCurrency] = useState('');

  // Counter handlers
  const increment = () => {
    setCount(count + 1);
    alert("Hello! Member1");
  };

  const decrement = () => setCount(count - 1);

  const sayWelcome = (msg) => alert(msg);

  const handleClick = (e) => alert("I was clicked");

  // Currency Converter handler
  const handleSubmit = (e) => {
    e.preventDefault();
    if (currency === "Euro") {
      alert("Converting to Euro Amount is " + amount * 80);
    }
  };

  return (
    <div style={{ padding: '20px' }}>
      <h1>{count}</h1>
      <button onClick={increment}>Increment</button>
      <button onClick={decrement}>Decrement</button>
      <button onClick={() => sayWelcome("welcome")}>Say welcome</button>
      <button onClick={handleClick}>Click on me</button>

      <h1 style={{ color: 'green' }}>Currency Convertor!!!</h1>
      <form onSubmit={handleSubmit}>
        <label>Amount: </label>
        <input type="text" value={amount} onChange={(e) => setAmount(e.target.value)} /><br />
        <label>Currency: </label>
        <input type="text" value={currency} onChange={(e) => setCurrency(e.target.value)} /><br />
        <button type="submit">Submit</button>
      </form>
    </div>
  );
}

export default App;
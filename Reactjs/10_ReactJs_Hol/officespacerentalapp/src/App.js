import React from 'react';
import './App.css';

function App() {
  // 1. Element for the heading
  const element = "Office Space";
  
  // 2. JSX Attribute for the image (using a placeholder office image)
  const sr = "https://images.unsplash.com/photo-1497366216548-37526070297c?auto=format&fit=crop&w=400&q=80";
  const jsxatt = <img src={sr} width="25%" height="25%" alt="Office Space" />;
  
  // 3. Object containing office details
  const ItemName = { Name: "DBS", Rent: 50000, Address: 'Chennai' };
  
  // 4. Logic to determine the CSS class based on Rent value
  let colors = [];
  if (ItemName.Rent <= 60000) {
    colors.push('textRed');
  } else {
    colors.push('textGreen');
  }

  // 5. Rendering the JSX to the DOM
  return (
    <div style={{ padding: '40px', fontFamily: 'Arial, sans-serif' }}>
      <h1>{element} , at Affordable Range </h1>
      
      {jsxatt}
      
      <h1>Name: {ItemName.Name}</h1>
      <h3 className={colors[0]}>Rent: Rs. {ItemName.Rent}</h3>
      <h3>Address: {ItemName.Address}</h3>
    </div>
  );
}

export default App;
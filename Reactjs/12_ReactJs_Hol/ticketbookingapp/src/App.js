import React, { useState } from 'react';

// Components for different states
const UserGreeting = () => <h1>Welcome back</h1>;
const GuestGreeting = () => <h1>Please sign up.</h1>;

const LoginButton = (props) => <button onClick={props.onClick}>Login</button>;
const LogoutButton = (props) => <button onClick={props.onClick}>Logout</button>;

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLogin = () => setIsLoggedIn(true);
  const handleLogout = () => setIsLoggedIn(false);

  return (
    <div style={{ padding: '50px' }}>
      {/* Conditional Rendering based on state */}
      {isLoggedIn ? <UserGreeting /> : <GuestGreeting />}
      
      {isLoggedIn ? (
        <LogoutButton onClick={handleLogout} />
      ) : (
        <LoginButton onClick={handleLogin} />
      )}
    </div>
  );
}

export default App;
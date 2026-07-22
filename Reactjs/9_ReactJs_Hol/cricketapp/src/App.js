import React from 'react';

// Player data
const players = [
  {id: 1, name: 'Jack', score: 50},
  {id: 2, name: 'Michael', score: 70},
  {id: 3, name: 'John', score: 40},
  {id: 4, name: 'Ann', score: 61},
  {id: 5, name: 'Elisabeth', score: 61},
  {id: 6, name: 'Sachin', score: 95},
  {id: 7, name: 'Dhoni', score: 100},
  {id: 8, name: 'Virat', score: 84},
  {id: 9, name: 'Jadeja', score: 64},
  {id: 10, name: 'Raina', score: 75},
  {id: 11, name: 'Rohit', score: 80}
];

// Components
const ListofPlayers = ({ players }) => (
  <ul>
    {players.map((item) => <li key={item.id}>Mr. {item.name} {item.score}</li>)}
  </ul>
);

const Scorebelow70 = ({ players }) => (
  <ul>
    {players.filter(item => item.score < 70).map(item => <li key={item.id}>Mr. {item.name} {item.score}</li>)}
  </ul>
);

const OddPlayers = ([first, , third, , fifth]) => (
  <div>
    <li>First : {first}</li>
    <li>Third : {third}</li>
    <li>Fifth : {fifth}</li>
  </div>
);

const EvenPlayers = ([, second, , fourth, , sixth]) => (
  <div>
    <li>Second : {second}</li>
    <li>Fourth : {fourth}</li>
    <li>Sixth : {sixth}</li>
  </div>
);

function App() {
  const flag = true; // Toggle this to false to see the second part of the lab
  
  const T20Players = ['Sachin1', 'Virat3', 'Yuvaraj5'];
  const RanjiTrophyPlayers = ['Dhoni2', 'Rohit4', 'Raina6'];
  const IndianPlayers = [...T20Players, ...RanjiTrophyPlayers];

  return (
    <div style={{ padding: '20px' }}>
      {flag ? (
        <div>
          <h1>List of Players</h1>
          <ListofPlayers players={players} />
          <hr />
          <h1>List of Players having Scores Less than 70</h1>
          <Scorebelow70 players={players} />
        </div>
      ) : (
        <div>
          <h1>Odd Players</h1>
          <OddPlayers {...IndianPlayers} />
          <h1>Even Players</h1>
          <EvenPlayers {...IndianPlayers} />
          <hr />
          <h1>List of Indian Players Merged:</h1>
          <ul>
            {IndianPlayers.map((name, index) => <li key={index}>Mr. {name}</li>)}
          </ul>
        </div>
      )}
    </div>
  );
}

export default App;
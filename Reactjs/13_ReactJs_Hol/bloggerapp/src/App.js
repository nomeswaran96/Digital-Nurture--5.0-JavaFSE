import React from 'react';

// Data Arrays
const books = [
  {id: 101, bname: 'Master React', price: 670},
  {id: 102, bname: 'Deep Dive into Angular 11', price: 800},
  {id: 103, bname: 'Mongo Essentials', price: 450}
];

const courses = [
  {name: 'Angular', date: '4/5/2021'},
  {name: 'React', date: '6/3/2021'}
];

function App() {
  // Mapping lists to components
  const bookdet = (
    <ul>
      {books.map((book) => (
        <div key={book.id}>
          <h3>{book.bname}</h3>
          <h4>{book.price}</h4>
        </div>
      ))}
    </ul>
  );

  const coursedet = (
    <ul>
      {courses.map((course, index) => (
        <div key={index}>
          <h3>{course.name}</h3>
          <p>{course.date}</p>
        </div>
      ))}
    </ul>
  );

  const content = (
    <div>
      <h3>React Learning</h3>
      <p>Stephen Biz</p>
      <p>Welcome to learning React!</p>
      <h3>Installation</h3>
      <p>Schewzdenier</p>
      <p>You can install React from npm.</p>
    </div>
  );

  return (
    <div style={{ display: 'flex', justifyContent: 'space-around' }}>
      <div className="st2">
        <h1>Course Details</h1>
        {coursedet}
      </div>
      <div className="v1">
        <h1>Book Details</h1>
        {bookdet}
      </div>
      <div className="mystyle1">
        <h1>Blog Details</h1>
        {content}
      </div>
    </div>
  );
}

export default App;
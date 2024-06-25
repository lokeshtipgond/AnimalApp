import { useState } from 'react';
import AnimalShow from './animalShow';
import './app.css';

function getRandomAnimal() {
  const animals = [ 'cat', 'dog', 'gator', 'horse', 'bird', 'cow']

  return animals[Math.floor(Math.random() * animals.length)]


}
console.log(getRandomAnimal());
function App() {
  const [animals, setAnimals] = useState([]);

  const handleClick = () => {
    setAnimals([...animals, getRandomAnimal()])
  console.log(animals);
  }
  const renderedAnimals = animals.map((animal, index) => {
    return <AnimalShow type={animal} key={index} />
  });
  return (
    <div className="app">

      <button onClick={handleClick} >Add Animal</button>
      <div className='animal-list'>
        {renderedAnimals}

      </div>
    </div>
  );
}

export default App;

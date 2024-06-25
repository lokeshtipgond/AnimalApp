import bird from './Images/bird.svg'
import heart from './Images/heart.svg'
import dog from './Images/dog.svg'
import cow from './Images/cow.svg'
import horse from './Images/horse.svg'
import cat from './Images/cat.svg'
import gator from './Images/gator.svg'
import { useState } from 'react'
import './animalShow.css'


function AnimalShow({ type }) {
    const [clicks, setClicks] = useState(0)

    const handleclick = () => {
        setClicks(clicks + 1);
    }

    const svgMap = {
        cat, dog, gator, horse, bird, cow
    }

    return (
        <div onClick={handleclick} className='animal-show'>
            <img className='animal' alt='animal images' src={svgMap[type]} />
            <img className='heart' alt='heart images' src={heart} 
            style={{width : 10 + 10 * clicks +'px'}}
            />
        </div>
    )
}

export default AnimalShow;
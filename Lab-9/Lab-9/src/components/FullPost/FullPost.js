import React, { Component } from 'react';

import './FullPost.css';

const FullPost = (props) => {
    
        let post = <p>Please select a Post!</p>;
        if(props.id !=null){
            post = (
                <div className="FullPost">
                    <h1>{props.title}</h1>
                    <p>{props.author}</p>
                    <div className="Edit">
                        <button className="Delete" onClick={props.deleter}>Delete</button>
                    </div>
                </div>
                 );
        }

       
        return post;
    }

export default FullPost;
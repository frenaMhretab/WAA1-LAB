import axios from 'axios';
import React, { useState } from 'react';

import './NewPost.css';



    const NewPost = (props) =>{
       const [post,setPost]=  useState({
            title: '',
            content: '',
            author: ''
        })
        
 const addPostHandeler = () => {
     axios.post('http://localhost:8080/api/v1/posts',post)
     .then(data=>{
         props.execute();
         console.log("success")
     })
     .catch(e=> console.log(e));

 }

        return (
            <div className="NewPost">
                <h1>Add a Post</h1>
                <label>Title</label>
                <input type="text" value={post.title} onChange={(event) => setPost({...post,title: event.target.value})} />
                <label>Content</label>
                <textarea rows="4" value={post.content} onChange={(event) => setPost({...post,content: event.target.value})} />
                <label>Author</label>
                <select value={post.author} onChange={(event) => setPost({...post,author: event.target.value})}>
                    <option value="Dean" selected>Dean</option>
                    <option value="Zaineh">Zaineh</option>
                    <option value="Yasmeen">Yasmeen</option>
                </select>
                <button onClick={addPostHandeler}>Add Post</button>
            </div>
        );
    }

    
        
    


export default NewPost;
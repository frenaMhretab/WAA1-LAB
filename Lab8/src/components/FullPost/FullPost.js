import React from "react";

import "./FullPost.css";
import Comment from './../Comment/Comment';

const FullPost = (props) => {
  let post = <p>Please select a Post!</p>;
  if (props.id != null) {
    post = (
      <div className="FullPost">
        <h1>{props.title}</h1>
        <h4>{props.author}</h4>
      
        <div className="post-comments-count">{post.comments ? post.comments.length : 0} Comments</div>
              {(post.comments || []).map((comment, idx) => <Comment key={comment.id + idx} comment={comment.name} />)}
            
        <div className="Edit">
        <button className="Edit" onClick={props.edit}>
            Edit
          </button>
          <button className="Delete" onClick={props.deleter}>
            Delete
          </button>
        </div>
      </div>
    );
  }

  return post;
};

export default FullPost;

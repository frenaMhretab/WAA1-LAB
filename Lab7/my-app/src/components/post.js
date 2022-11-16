import "./post.css";
const Post = (props) => {
  return (
    <div class="post" onClick={() => props.display(props.id)}>
      <p>ID: {props.id}</p>
      <p>Title: {props.title}</p>
      <p>Author: {props.author}</p>
    </div>
  );
};

export default Post;

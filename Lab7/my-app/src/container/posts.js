import Post from "../components/post";

const Posts = (props) => {
  const posts = props.posts.map((p) => {
    return (
      <Post
        id={p.id}
        title={p.title}
        author={p.author}
        key={p.id}
        display={props.display}
      />
    );
  });
  return posts;
};

export default Posts;

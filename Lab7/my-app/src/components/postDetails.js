const PostDetails = (props) => {
  return (
    <div class="postDetail">
      <p class="title">{props.postDetail.title}</p>
      <p>{props.postDetail.author}</p>
      <p>This is the content in the post...</p>
      <button>Edit</button>
      <button>Delete</button>
    </div>
  );
};

export default PostDetails;

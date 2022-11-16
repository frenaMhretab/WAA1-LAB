import Posts from "./posts";
import { useState } from "react";
import PostDetails from "../components/postDetails";

const Dashboard = () => {
  const [allPost, setPost] = useState([
    { id: 111, title: "happiness", author: "John" },
    { id: 112, title: "MIU", author: "Dean" },
    { id: 113, title: "Enjoy life", author: "Jasmine" },
  ]);

  const [postDetails, setPostDetails] = useState([
    { id: "", title: "", author: "" },
  ]);

  const [flag, setFlag] = useState("false");

  const [title, setTitle] = useState("");

  const changeName = (event) => {
    const copyPosts = [...allPost];
    copyPosts[0].title = title;
    setPost(copyPosts);
  };

  const displayDetails = (id) => {
    const selected = allPost.find((e) => e.id === id);
    setPostDetails(selected);
    setFlag("true");
  };

  return (
    <div>
      <Posts posts={allPost} display={displayDetails} />
      <div>
        <input
          type="text"
          title="title"
          onChange={(e) => setTitle(e.target.value)}
        ></input>
        <button onClick={changeName}> Change title </button>
      </div>
      {flag && <PostDetails postDetail={postDetails} />}
    </div>
  );
};

export default Dashboard;

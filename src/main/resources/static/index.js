const form = document.getElementById("form");
const name = document.getElementById("name");
const email = document.getElementById("email");
const dob = document.getElementById("dob");
const gender = document.getElementById("gender");
const phone = document.getElementById("phone");
const job = document.getElementById("job");
const quali = document.getElementById("quali");
const doj = document.getElementById("doj");
const exp = document.getElementById("exp");
//
const showRecBtn = document.getElementById("show-records");

form.addEventListener("submit", (e) => {
  e.preventDefault();

  if (
    name == "" ||
    email == "" ||
    dob == "" ||
    gender == "" ||
    phone == "" ||
    job == "" ||
    quali == "" ||
    doj == "" ||
    exp == ""
  ) {
    alert("PLEASE ENTER ALL THE FIELDS");
  } else {
    postdetails();
  }
});

async function postdetails() {
  console.log("POSTING DATA");
  const data = {
    name: name.value,
    email: email.value,
    dob: dob.value,
    gender: gender.value,
    phone: phone.value,
    job: job.value,
    qualification: quali.value,
    doj: doj.value,
    exp: exp.value,
  };
  console.log(data);

  axios
    .post("http://13.233.230.132:8080/post-details", data)
    .then((res) => {
      console.log(res.data);
    })
    .catch((err) => {
      console.log(err);
      alert(err);
    });
}

showRecBtn.addEventListener("click", (e) => {
  console.log("redirect to details page");
  window.location.href = "/details";
});

const records = document.getElementById("records");

axios
  .get("http://13.233.230.132:8080/get-details")
  .then((res) => {
    console.log(res.data);
    let details = res.data;
    showData(details);
  })
  .catch((err) => alert(err));

function showData(details) {
  details.forEach((val, index) => {
    let age = calculateDOB(val.dob);
    let exp = calculateTotalExp(val.doj, val.exp);
    records.innerHTML += `
        <div class="records">
            <h1><span>${index + 1 + ")"}</span> ${val.name}</h1>
            <h1>AGE : ${age}</h1>
            <h1>PHONE : ${val.phone}</h1>
            <h1>EMAIL : ${val.email}</h1>
            <h1>TOTAL EXPERIENCE : ${exp}</h1>
        </div>`;
  });
}

function calculateDOB(date) {
  //   console.log(date);
  var birthDate = new Date(date);
  var difference = Date.now() - birthDate.getTime();
  var ageDate = new Date(difference);
  var calculatedAge = Math.abs(ageDate.getUTCFullYear() - 1970);
  //   console.log(calculatedAge);
  return calculatedAge;
}

function calculateTotalExp(date, exp) {
  //   console.log("JOINING DATE", date, "previous exp :", exp);
  var joinedDate = new Date(date);
  var difference = Date.now() - joinedDate.getTime();
  var expDate = new Date(difference);
  var calculatedExp = Math.abs(expDate.getUTCFullYear() - 1970);
  //   console.log(calculatedExp);
  return calculatedExp + parseInt(exp);
}

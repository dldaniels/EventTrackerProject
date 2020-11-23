// window.addeventListener('load', function(){
//  console.log('Script loaded'); 
//  });

 
 window.addEventListener('load', function(e) {
  console.log('document loaded');
  init();
});
function init() {
  document.runForm.lookup.addEventListener('click', function(event) {
    event.preventDefault();
    var runId = document.runForm.runId.value;
    if (!isNaN(runId) && runId > 0) {
      getRun(runId);
    }
  });
  document.newRunForm.submit.addEventListener('click', function(evt){
    evt.preventDefault();
    postNewRun(evt);
  });
}
function getRun(runId) {
  console.log('getRun(): runId=' + runId);
  // TODO:
  // * Use XMLHttpRequest to perform a GET request to "api/films/"
  //   with the filmId appended.
  let xhr = new XMLHttpRequest();
  xhr.open('GET', 'api/runs/' + runId);
  xhr.onreadystatechange = function() {
  	if ( xhr.readyState === 4 ) {
  		if ( xhr.status === 200 ) {
		    // * On success, if a response was received parse the film data
		  	//   and pass the film object to displayFilm().
		  	let run = JSON.parse(xhr.responseText);
		  	console.log(xhr.responseText);
        console.log(run);
        displayRun(run);
	  	}
	  	else {
		  	// * On failure, or if no response text was received, put "Film not found"
		  	//   in the filmData div.
        console.error('Run not found.');
        // TODO display film not found in div.
        displayError('Run not found.')
	  	}
  	}
  };
  xhr.send();
}
function displayError(msg) {
  let div = document.getElementById('runData');
  div.textContent = msg;
}
function displayRun(run) {
  var dataDiv = document.getElementById('runData');
  dataDiv.textContent = '';
  let h1 = document.createElement('h1');
  h1.textContent = run.name;
  dataDiv.appendChild(h1);
  let bq = document.createElement('h2');
  bq.textContent = run.date;
  dataDiv.appendChild(h2);
  let ul = document.createElement('ul');
  let li = document.createElement('li');
  li.textContent = run.location;
  ul.appendChild(li);
  li = document.createElement('li');
  li.textContent = run.time;
  ul.appendChild(li);
  li = document.createElement('li');
  li.textContent = run.distance;
  ul.appendChild(li);
  li = document.createElement('li');
  li.textContent = run.calories;
  ul.appendChild(li);
  li = document.createElement('li');
  li.textContent = run.elevationGain;
  ul.appendChild(li);
  li = document.createElement('li');
  li.textContent = run.avgHeartRate;
  ul.appendChild(li);
  dataDiv.appendChild(ul);
  // TODO: pass film.id to a displayActors(filmId) function
  //       that will XHR to retrieve /api/films/{filmId}/actors
  //       to get an array of actors, then list them in the actorData
  //       div.

}

function postNewRun(e) {
  let form = document.newRunForm;
  let newRun = {
    name: form.name.value,
    date: form.date.value,
    location: form.location.value,
    time: form.time.value,
    distance: form.distance.value,
    elevationGain: form.elevationGain.value,
    avgHeartRate: form.avgHeartRate.value,
    calories: form.calories.value
    
  };
  console.log(newRun);
  let xhr = new XMLHttpRequest();
  xhr.open('POST', 'api/runs');
  xhr.onreadystatechange = function(){
    if (xhr.readyState === 4) {
      if (xhr.status === 201 || xhr.status === 200) {
        let savedRun = JSON.parse(xhr.responseText);
        displayRun(savedRuns);
      }
      else {
        console.error('Error creating run, status=' + xhr.status);
        console.error(xhr.responseText);
        displayError('Invalid run data.');
      }
    }
  };
  xhr.setRequestHeader('Content-type','application/json')
  xhr.send(JSON.stringify(newRun));
}
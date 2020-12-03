export class Run {

  id: number;
  name: string;
  location: string;
  distance: number;
  time: number;
  calories: number;
  elevationGain: number;
  avgHeartRate: number;
  date: string;
  description: string;

  constructor (
    id?: number,
  name?: string,
  location?: string,
  distance?: number,
  time?: number,
  calories?: number,
  elevationGain?: number,
  avgHeartRate?: number,
  date?: string,
   description?: string
  ) {
    this.id = id;
    this.name = name;
    this.location = location;
    this.distance = distance;
    this.time = time;
    this.calories = calories;
    this.elevationGain = elevationGain;
    this.avgHeartRate = avgHeartRate;
    this.date = date;
    this.description = description;

  }

}

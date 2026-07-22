import React from 'react';
import styles from './CohortDetails.module.css';

const CohortDetails = () => {
  const cohorts = [
    { id: 1, name: "INTADMDF10 -.NET FSD", startedOn: "22-Feb-2022", status: "scheduled", coach: "Aathma", trainer: "Jojo Jose" },
    { id: 2, name: "ADM21JF014 -Java FSD", startedOn: "10-Sep-2021", status: "ongoing", coach: "Apoorv", trainer: "Elisa Smith" },
    { id: 3, name: "CDBJF21025 -Java FSD", startedOn: "24-Dec-2021", status: "ongoing", coach: "Aathma", trainer: "John Doe" }
  ];

  return (
    <div>
      <h1>Cohorts Details</h1>
      {cohorts.map(cohort => (
        <div key={cohort.id} className={styles.box}>
          <h3 style={{ color: cohort.status === 'ongoing' ? 'green' : 'blue' }}>
            {cohort.name}
          </h3>
          <dl>
            <dt>Started On</dt>
            <dd>{cohort.startedOn}</dd>
            <dt>Current Status</dt>
            <dd>{cohort.status.charAt(0).toUpperCase() + cohort.status.slice(1)}</dd>
            <dt>Coach</dt>
            <dd>{cohort.coach}</dd>
            <dt>Trainer</dt>
            <dd>{cohort.trainer}</dd>
          </dl>
        </div>
      ))}
    </div>
  );
};

export default CohortDetails;
import styled from "styled-components";
import SearchTicket from "./elements/SearchTicket";
import WorldMap from "./elements/WorldMap";
import mainBanner from "../../../assets/image/mainBanner.png";
import TourList from "./elements/TourList";
import { useState } from "react";

const Main = () => {
  const [tourItem, setTourItem] = useState(null);
  const [tourContinent, setTourContinent] = useState("South America");

  return (
    <>
      <FistSection>
        <div className="greetings-section">
          <div>안녕하세요</div>
        </div>
        <div className="search-section">
          <SearchTicket />
        </div>
      </FistSection>
      <SecondSection>
        <WorldMap tourItem={tourItem} tourContinent={tourContinent} />
      </SecondSection>
      <ThirdSection>
        <TourList
          setTourItem={setTourItem}
          setTourContinent={setTourContinent}
        />
      </ThirdSection>
    </>
  );
};

const FistSection = styled.div`
  text-align: center;
  height: 400px;
  background: url(${mainBanner});
  background-size: cover;
  padding: 48px 0;
  margin-bottom: 48px;

  .greetings-section {
    display: flex;
    flex-direction: column;
    align-items: center;

    > div {
      width: 1200px;
      margin: 0 20px;
      height: 116px;
      color: #ffffff;
      margin-bottom: 44px;
    }
  }

  .search-section {
    display: flex;
    flex-direction: column;
    align-items: center;
  }
`;

const SecondSection = styled.div`
  display: flex;
  align-items: center;
  justify-content: center;
`;

const ThirdSection = styled.div`
  display: flex;

  height: 600px;
  justify-content: center;
`;

export default Main;
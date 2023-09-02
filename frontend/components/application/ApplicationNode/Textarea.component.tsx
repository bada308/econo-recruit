"use client";

import Txt from "@/components/common/Txt.component";
import {
  ApplicationNode,
  ApplicationTextarea,
} from "@/src/constants/application/type";
import { useLocalStorage } from "@/src/hooks/useLocalstorage.hook";
import { FC } from "react";

interface ApplicationTexareaProps {
  data: ApplicationNode;
}

const ApplicationTexarea: FC<ApplicationTexareaProps> = ({ data }) => {
  const textData = data as ApplicationTextarea;
  const [value, setValue] = useLocalStorage(textData.name, "");

  return (
    <>
      {textData.title && (
        <label>
          <Txt typography="h6">{`${textData.title}${
            textData.require ? "*" : ""
          }`}</Txt>
          {textData.subtitle && <Txt>{` ${textData.subtitle}`}</Txt>}
        </label>
      )}
      <textarea
        className="my-2 border rounded-lg p-4 w-full resize-none"
        rows={20}
        name={textData.name}
        value={value}
        maxLength={1000}
        onChange={(e) => {
          if (e.target.value.length > 1000)
            return alert("1000자 이내로 작성해주세요.");
          setValue(e.target.value);
        }}
      />
    </>
  );
};

export default ApplicationTexarea;

import Txt from "@/components/common/Txt.component";
import { ApplicantReq } from "@/src/apis/applicant";
import { applicantDataFinder } from "@/src/functions/finder";
import { FC } from "react";

interface ApplicantTextareaProps {
  nodeData: ApplicantNode;
  data: ApplicantReq[];
}

const ApplicantTextarea: FC<ApplicantTextareaProps> = ({ nodeData, data }) => {
  const textareaData = nodeData as ApplicantTextareaNode;

  return (
    <>
      <Txt className="block pt-6 pb-12 ml-6">
        {applicantDataFinder(data, textareaData.value.name)}
      </Txt>
    </>
  );
};

export default ApplicantTextarea;

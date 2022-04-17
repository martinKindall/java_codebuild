# CodeBuild example for Maven

Just learning the basics of AWS CodeBuild. The steps for the build are
specified in the __buildspec.yaml__ file.

Available runtimes and their corresponding
images [here](https://docs.aws.amazon.com/codebuild/latest/userguide/available-runtimes.html).

### Run CodeBuild locally

Follow the instructions [here](https://docs.aws.amazon.com/codebuild/latest/userguide/use-codebuild-agent.html) to run it locally. You may have to use
the following command in oder to be able to download the image from ECR:

```bash
aws ecr-public get-login-password --region us-east-1 | docker login --username AWS --password-stdin public.ecr.aws/codebuild/<SELECTED-IMAGE>
```

As image you could use Ubuntu 20.04 (aws/codebuild/standard:5.0) or else, depending on the runtime you need.

Finally to run CodeBuild locally:
```bash
./codebuild_build.sh -i public.ecr.aws/codebuild/amazonlinux2-x86_64-standard:3.0 -a build_output
```

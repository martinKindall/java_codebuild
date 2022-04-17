# CodeBuild example for Maven

Just learning the basics of AWS CodeBuild. The steps for the build are
specified in the __buildspec.yaml__ file.

The allowed CodeBuild runtimes are described [here](https://docs.aws.amazon.com/codebuild/latest/userguide/runtime-versions.html).

### Run CodeBuild locally

Follow the instructions [here](https://docs.aws.amazon.com/codebuild/latest/userguide/use-codebuild-agent.html) to run it locally. You may have to use
the following command in oder to be able to download the image from ECR:

```bash
aws ecr-public get-login-password --region us-east-1 | docker login --username AWS --password-stdin public.ecr.aws/codebuild/amazonlinux2-x86_64-standard
```

Finally to run CodeBuild locally:
```bash
./codebuild_build.sh -i public.ecr.aws/codebuild/amazonlinux2-x86_64-standard:3.0 -a build_output
```
